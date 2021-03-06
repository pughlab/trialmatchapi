package com.pughlab.trialmatchapi.repository;




import com.pughlab.trialmatchapi.domain.Genomic;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

/**
 * Interface for REST APIs for retrieving genomic information to trials
 *
 * @author  Kelsey Zhu
 * @version 1.0
 * @since   2018-04-21
 */

public interface GenomicRepository extends MongoRepository<Genomic, Integer> {

    Genomic findById(String id);

    List<Genomic> findGenomicByProteinChangeAndSampleId(String proteinChange, String sampleId);

    @Override
    void delete(Genomic genomic);
}