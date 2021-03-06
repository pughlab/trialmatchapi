package com.pughlab.trialmatchapi.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Trial object stores clinical trial information
 *
 * @author  Kelsey Zhu
 * @version 1.0
 * @since   2018-04-21
 */

@Document(collection = "genomic")
public class Genomic {

    @Id
    @Field("_id")
    private String id;

    @NotNull
    @Size(min = 1)
    @Field("SAMPLE_ID")
    private String sampleId;

    @NotNull
    @Size(min = 1)
    @Field("TRUE_HUGO_SYMBOL")
    private String hugoSymbol;

    @NotNull
    @Size(min = 1)
    @Field("TRUE_PROTEIN_CHANGE")
    private String proteinChange;

    @NotNull
    @Size(min = 1)
    @Field("TRUE_TRANSCRIPT_EXON")
    private String exonNumber;

    @NotNull
    @Size(min = 1)
    @Field("MUTATION_EFFECT")
    private String mutEffect;

    @NotNull
    @Size(min = 1)
    @Field("ONCOGENICITY")
    private String oncogenicity;

    @NotNull
    @Size(min = 1)
    @Field("TRUE_VARIANT_CLASSIFICATION")
    private String classification;

    @NotNull
    @Size(min = 1)
    @Field("VARIANT_CATEGORY")
    private String category;

    @NotNull
    @Size(min = 1)
    @Field("CNV_CALL")
    private String cnvCall;

    public Genomic(String id, String sampleId, String hugoSymbol, String proteinChange, String exonNumber,
                   String mutEffect, String oncogenicity, String classification, String category, String cnvCall) {
        this.id = id;
        this.sampleId = sampleId;
        this.hugoSymbol = hugoSymbol;
        this.proteinChange = proteinChange;
        this.exonNumber = exonNumber;
        this.mutEffect = mutEffect;
        this.oncogenicity = oncogenicity;
        this.classification = classification;
        this.category = category;
        this.cnvCall = cnvCall;
    }

    public String getId() {
        return  id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSampleId() { return this.sampleId; }

    public void setSampleId(String sampleId) { this.sampleId = sampleId; }

    public String getHugoSymbol() {
        return hugoSymbol;
    }

    public void setHugoSymbol(String hugoSymbol) {
        this.hugoSymbol = hugoSymbol;
    }

    public String getProteinChange() {
        return  proteinChange;
    }

    public void setProteinChange(String proteinChange) {
        this.proteinChange = proteinChange;
    }

    public String getExonNumber() { return this.exonNumber; }

    public void setExonNumber(String exonNumber) { this.exonNumber = exonNumber; }

    public String getMutEffect() { return mutEffect; }

    public void setMutEffect(String mutEffect) {
        this.mutEffect = mutEffect;
    }

    public String getOncogenicity() { return  oncogenicity; }

    public void setOncogenicity(String oncogenicity) {
        this.oncogenicity = oncogenicity;
    }

    public String getClassification() { return classification; }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getCategory() { return category; }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCnvCall() { return cnvCall; }

    public void setCnvCall(String cnvCall) {
        this.cnvCall = cnvCall;
    }

}