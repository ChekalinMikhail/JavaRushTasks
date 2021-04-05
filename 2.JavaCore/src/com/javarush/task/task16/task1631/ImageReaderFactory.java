package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) {
        ImageReader reader = null;

        if (type != null) {

            switch (type) {
                case JPG:
                    return reader = new JpgReader();
                case PNG:
                    return reader = new PngReader();

                case BMP:
                    return reader = new BmpReader();

            }
        }

        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
