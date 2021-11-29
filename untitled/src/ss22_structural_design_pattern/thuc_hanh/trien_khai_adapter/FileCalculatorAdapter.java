package ss22_structural_design_pattern.thuc_hanh.trien_khai_adapter;

import java.io.File;


public class FileCalculatorAdapter implements FileCalculator{
    @Override
    public long calculateSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}
