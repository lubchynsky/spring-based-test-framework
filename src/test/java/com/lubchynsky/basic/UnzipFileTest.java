package com.lubchynsky.basic;

import org.springframework.util.ResourceUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static com.lubchynsky.services.ZippedFilesReader.unzipFile;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

public class UnzipFileTest {

    @Test
    public void unzipFilesTest() throws IOException {
        File compressedFile = ResourceUtils.getFile("classpath:files/compressed_files.zip");
        List<File> unzippedFiles = unzipFile(compressedFile);
        assertThat("There should be 2 files after unzip", unzippedFiles, hasSize(2));
    }
}
