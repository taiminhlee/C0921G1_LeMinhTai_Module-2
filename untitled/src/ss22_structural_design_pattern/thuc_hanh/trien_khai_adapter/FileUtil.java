package ss22_structural_design_pattern.thuc_hanh.trien_khai_adapter;

import java.io.File;

public class FileUtil {
    public FileUtil() {
    }

    public long calculateSize(File file) {
        if (file.isFile()) {
            return file.length();
        } else {
            File[] children = file.listFiles();
            int size = 0;
            File[] var4 = children;
            int var5 = children.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                File child = var4[var6];
                size = (int)((long)size + this.calculateSize(child));
            }

            return (long)size;
        }
    }
}
