package com.antra.evaluation.reporting_system.repo;

import com.antra.evaluation.reporting_system.pojo.api.PDFResponse;
import com.antra.evaluation.reporting_system.pojo.report.PDFFile;
import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.File;
import java.io.FileNotFoundException;

public interface PDFRepository extends MongoRepository<PDFFile, String> {

    PDFFile deletePDFFileById(String id);
    //PDFFile deletePDFFilesById(String id);

}
