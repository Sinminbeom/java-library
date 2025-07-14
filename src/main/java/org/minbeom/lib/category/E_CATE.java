package org.minbeom.lib.category;

import org.minbeom.lib.delegate.Action;

public enum E_CATE {
    DOWNLOADER,
    UPLOADER;

    public enum E_DOWNLOADER {
        DOCUMENT,
        IMAGE,
        VIDEO;

        public enum E_DOCUMENT {
            WORD(() -> {System.out.println("WORD");}),
            PDF(() -> {System.out.println("PDF");}),
            EXCEL(() -> {System.out.println("EXCEL");}),
            TEXT(() -> {System.out.println("TEXT");});

            private final Action action;

            E_DOCUMENT(Action action) {
                this.action = action;
            }

            public Action getAction() {
                return action;
            }
        }

        public enum E_IMAGE {
            JPEG(() -> {System.out.println("JPEG");}),
            PDF(() -> {System.out.println("PDF");}),
            EXCEL(() -> {System.out.println("EXCEL");}),
            TEXT(() -> {System.out.println("TEXT");});

            private final Action action;

            E_IMAGE(Action action) {
                this.action = action;
            }

            public Action getAction() {
                return action;
            }
        }

        public enum E_VIDEO {
            MP4(() -> {System.out.println("MP4");}),
            AVI(() -> {System.out.println("AVI");}),
            MKV(() -> {System.out.println("MKV");}),
            MOV(() -> {System.out.println("MOV");});

            private final Action action;

            E_VIDEO(Action action) {
                this.action = action;
            }

            public Action getAction() {
                return action;
            }
        }
    }

    public enum E_UPLOADER {
        DOCUMENT,
        IMAGE,
        VIDEO;

        public enum E_DOCUMENT {
            WORD(() -> {System.out.println("WORD");}),
            PDF(() -> {System.out.println("PDF");}),
            EXCEL(() -> {System.out.println("EXCEL");}),
            TEXT(() -> {System.out.println("TEXT");});

            private final Action action;

            E_DOCUMENT(Action action) { this.action = action; }

            public Action getAction() {
                return action;
            }
        }

        public enum E_IMAGE {
            JPEG(() -> {System.out.println("JPEG");}),
            PDF(() -> {System.out.println("PDF");}),
            EXCEL(() -> {System.out.println("EXCEL");}),
            TEXT(() -> {System.out.println("TEXT");});

            private final Action action;

            E_IMAGE(Action action) { this.action = action; }

            public Action getAction() {
                return action;
            }
        }

        public enum E_VIDEO {
            MP4(() -> {System.out.println("MP4");}),
            AVI(() -> {System.out.println("AVI");}),
            MKV(() -> {System.out.println("MKV");}),
            MOV(() -> {System.out.println("MOV");});

            private final Action action;

            E_VIDEO(Action action) { this.action = action; }

            public Action getAction() {
                return action;
            }
        }
    }

}
