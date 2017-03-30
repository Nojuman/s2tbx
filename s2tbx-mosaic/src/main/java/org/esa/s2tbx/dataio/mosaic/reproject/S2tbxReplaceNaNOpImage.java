package org.esa.s2tbx.dataio.mosaic.reproject;

import org.esa.snap.core.gpf.internal.OperatorContext;

import javax.media.jai.PointOpImage;
import javax.media.jai.RasterAccessor;
import javax.media.jai.RasterFormatTag;
import java.awt.*;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;

/**
 * @author Razvan Dumitrascu
 * @since 5.0.2
 */
public class S2tbxReplaceNaNOpImage extends PointOpImage {

    private final double replacementValue;

    S2tbxReplaceNaNOpImage(RenderedImage source, double value) {
        super(source, null, null, true);
        this.replacementValue = value;
        OperatorContext.setTileCache(this);
    }

    @Override
    protected void computeRect(Raster[] sources, WritableRaster dest, Rectangle destRect) {
        RasterFormatTag[] formatTags = getFormatTags();
        RasterAccessor s = new RasterAccessor(sources[0], destRect, formatTags[0], getSourceImage(0).getColorModel());
        RasterAccessor d = new RasterAccessor(dest, destRect, formatTags[1], getColorModel());
        switch (d.getDataType()) {
            case 4: // '\004'
                computeRectFloat(s, d, (float) replacementValue);
                break;

            case 5: // '\005'
                computeRectDouble(s, d, replacementValue);
                break;
        }
        d.copyDataToRaster();
    }

    private void computeRectFloat(RasterAccessor src, RasterAccessor dst, float rValue) {
        int sLineStride = src.getScanlineStride();
        int sPixelStride = src.getPixelStride();
        int[] sBandOffsets = src.getBandOffsets();
        float[][] sData = src.getFloatDataArrays();
        int dwidth = dst.getWidth();
        int dheight = dst.getHeight();
        int dLineStride = dst.getScanlineStride();
        int dPixelStride = dst.getPixelStride();
        int[] dBandOffsets = dst.getBandOffsets();
        float[][] dData = dst.getFloatDataArrays();
        float[] s = sData[0];
        float[] d = dData[0];
        int sLineOffset = sBandOffsets[0];
        int dLineOffset = dBandOffsets[0];
        for (int h = 0; h < dheight; h++) {
            int sPixelOffset = sLineOffset;
            int dPixelOffset = dLineOffset;
            sLineOffset += sLineStride;
            dLineOffset += dLineStride;
            for (int w = 0; w < dwidth; w++) {
                float sourceValue = s[sPixelOffset];
                if (Float.isNaN(sourceValue)) {
                    d[dPixelOffset] = rValue;
                } else {
                    d[dPixelOffset] = sourceValue;
                }
                sPixelOffset += sPixelStride;
                dPixelOffset += dPixelStride;
            }
        }
    }

    private void computeRectDouble(RasterAccessor src, RasterAccessor dst, double rValue) {
        int sLineStride = src.getScanlineStride();
        int sPixelStride = src.getPixelStride();
        int[] sBandOffsets = src.getBandOffsets();
        double[][] sData = src.getDoubleDataArrays();
        int dwidth = dst.getWidth();
        int dheight = dst.getHeight();
        int dLineStride = dst.getScanlineStride();
        int dPixelStride = dst.getPixelStride();
        int[] dBandOffsets = dst.getBandOffsets();
        double[][] dData = dst.getDoubleDataArrays();
        double[] s = sData[0];
        double[] d = dData[0];
        int sLineOffset = sBandOffsets[0];
        int dLineOffset = dBandOffsets[0];
        for (int h = 0; h < dheight; h++) {
            int sPixelOffset = sLineOffset;
            int dPixelOffset = dLineOffset;
            sLineOffset += sLineStride;
            dLineOffset += dLineStride;
            for (int w = 0; w < dwidth; w++) {
                double sourceValue = s[sPixelOffset];
                if (Double.isNaN(sourceValue)) {
                    d[dPixelOffset] = rValue;
                } else {
                    d[dPixelOffset] = sourceValue;
                }
                sPixelOffset += sPixelStride;
                dPixelOffset += dPixelStride;
            }
        }
    }
}
