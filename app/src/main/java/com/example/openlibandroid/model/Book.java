package com.example.openlibandroid.model;

import java.util.List;

public class Book {
    private String title_suggest;
    private List<String> edition_key;
    private Integer cover_i;
    private List<String> isbn;
    private Boolean has_fulltext;
    private List<String> text;
    private List<String> contributor;
    private List<String> id_bodleian__oxford_university;
    private List<String> ia_loaded_id;
    private List<String> seed;
    private List<String> oclc;
    private List<String> id_google;
    private List<String> ia;
    private List<String> id_amazon_ca_asin;
    private List<String> author_key;
    private List<String> id_amazon_it_asin;
    private List<String> subject;
    private List<String> id_amazon_co_uk_asin;
    private List<String> id_british_library;
    private String title;
    private String lending_identifier_s;
    private String ia_collection_s;
    private Integer  first_publish_year;
    private List<String> id_amazon_de_asin;
    private String type;
    private List<String> publish_place;
    private List<String>ia_box_id;
    private Integer  edition_count;
    private List<String> author_name;
    private String key;
    private List<String> id_alibris_id;
    private List<String> id_goodreads;
    private List<String> author_alternative_name;
    private Boolean public_scan_b;
    private List<String>publisher;
    private List<String>id_amazon;
    private List<String>id_canadian_national_library_archive;
    private List<String>language;
    private List<String> lccn;
    private Integer  last_modified_i;
    private String lending_edition_s;
    private List<String> id_librarything;
    private String cover_edition_key;
    private List<String> person;
    private List<String> publish_year;
    private String printdisabled_s;
    private List<String> place;
    private List<String> publish_date;

    public Book() {
    }

    public Book(String title_suggest, List<String> edition_key, Integer cover_i, List<String> isbn, Boolean has_fulltext, List<String> text, List<String> contributor, List<String> id_bodleian__oxford_university, List<String> ia_loaded_id, List<String> seed, List<String> oclc, List<String> id_google, List<String> ia, List<String> id_amazon_ca_asin, List<String> author_key, List<String> id_amazon_it_asin, List<String> subject, List<String> id_amazon_co_uk_asin, List<String> id_british_library, String title, String lending_identifier_s, String ia_collection_s, Integer first_publish_year, List<String> id_amazon_de_asin, String type, List<String> publish_place, List<String> ia_box_id, Integer edition_count, List<String> author_name, String key, List<String> id_alibris_id, List<String> id_goodreads, List<String> author_alternative_name, Boolean public_scan_b, List<String> publisher, List<String> id_amazon, List<String> id_canadian_national_library_archive, List<String> language, List<String> lccn, Integer last_modified_i, String lending_edition_s, List<String> id_librarything, String cover_edition_key, List<String> person, List<String> publish_year, String printdisabled_s, List<String> place, List<String> publish_date) {
        this.title_suggest = title_suggest;
        this.edition_key = edition_key;
        this.cover_i = cover_i;
        this.isbn = isbn;
        this.has_fulltext = has_fulltext;
        this.text = text;
        this.contributor = contributor;
        this.id_bodleian__oxford_university = id_bodleian__oxford_university;
        this.ia_loaded_id = ia_loaded_id;
        this.seed = seed;
        this.oclc = oclc;
        this.id_google = id_google;
        this.ia = ia;
        this.id_amazon_ca_asin = id_amazon_ca_asin;
        this.author_key = author_key;
        this.id_amazon_it_asin = id_amazon_it_asin;
        this.subject = subject;
        this.id_amazon_co_uk_asin = id_amazon_co_uk_asin;
        this.id_british_library = id_british_library;
        this.title = title;
        this.lending_identifier_s = lending_identifier_s;
        this.ia_collection_s = ia_collection_s;
        this.first_publish_year = first_publish_year;
        this.id_amazon_de_asin = id_amazon_de_asin;
        this.type = type;
        this.publish_place = publish_place;
        this.ia_box_id = ia_box_id;
        this.edition_count = edition_count;
        this.author_name = author_name;
        this.key = key;
        this.id_alibris_id = id_alibris_id;
        this.id_goodreads = id_goodreads;
        this.author_alternative_name = author_alternative_name;
        this.public_scan_b = public_scan_b;
        this.publisher = publisher;
        this.id_amazon = id_amazon;
        this.id_canadian_national_library_archive = id_canadian_national_library_archive;
        this.language = language;
        this.lccn = lccn;
        this.last_modified_i = last_modified_i;
        this.lending_edition_s = lending_edition_s;
        this.id_librarything = id_librarything;
        this.cover_edition_key = cover_edition_key;
        this.person = person;
        this.publish_year = publish_year;
        this.printdisabled_s = printdisabled_s;
        this.place = place;
        this.publish_date = publish_date;
    }

    public String getTitle_suggest() {
        return title_suggest;
    }

    public void setTitle_suggest(String title_suggest) {
        this.title_suggest = title_suggest;
    }

    public List<String> getEdition_key() {
        return edition_key;
    }

    public void setEdition_key(List<String> edition_key) {
        this.edition_key = edition_key;
    }

    public Integer getCover_i() {
        return cover_i;
    }

    public void setCover_i(Integer cover_i) {
        this.cover_i = cover_i;
    }

    public List<String> getIsbn() {
        return isbn;
    }

    public void setIsbn(List<String> isbn) {
        this.isbn = isbn;
    }

    public Boolean getHas_fulltext() {
        return has_fulltext;
    }

    public void setHas_fulltext(Boolean has_fulltext) {
        this.has_fulltext = has_fulltext;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public List<String> getContributor() {
        return contributor;
    }

    public void setContributor(List<String> contributor) {
        this.contributor = contributor;
    }

    public List<String> getId_bodleian__oxford_university() {
        return id_bodleian__oxford_university;
    }

    public void setId_bodleian__oxford_university(List<String> id_bodleian__oxford_university) {
        this.id_bodleian__oxford_university = id_bodleian__oxford_university;
    }

    public List<String> getIa_loaded_id() {
        return ia_loaded_id;
    }

    public void setIa_loaded_id(List<String> ia_loaded_id) {
        this.ia_loaded_id = ia_loaded_id;
    }

    public List<String> getSeed() {
        return seed;
    }

    public void setSeed(List<String> seed) {
        this.seed = seed;
    }

    public List<String> getOclc() {
        return oclc;
    }

    public void setOclc(List<String> oclc) {
        this.oclc = oclc;
    }

    public List<String> getId_google() {
        return id_google;
    }

    public void setId_google(List<String> id_google) {
        this.id_google = id_google;
    }

    public List<String> getIa() {
        return ia;
    }

    public void setIa(List<String> ia) {
        this.ia = ia;
    }

    public List<String> getId_amazon_ca_asin() {
        return id_amazon_ca_asin;
    }

    public void setId_amazon_ca_asin(List<String> id_amazon_ca_asin) {
        this.id_amazon_ca_asin = id_amazon_ca_asin;
    }

    public List<String> getAuthor_key() {
        return author_key;
    }

    public void setAuthor_key(List<String> author_key) {
        this.author_key = author_key;
    }

    public List<String> getId_amazon_it_asin() {
        return id_amazon_it_asin;
    }

    public void setId_amazon_it_asin(List<String> id_amazon_it_asin) {
        this.id_amazon_it_asin = id_amazon_it_asin;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public List<String> getId_amazon_co_uk_asin() {
        return id_amazon_co_uk_asin;
    }

    public void setId_amazon_co_uk_asin(List<String> id_amazon_co_uk_asin) {
        this.id_amazon_co_uk_asin = id_amazon_co_uk_asin;
    }

    public List<String> getId_british_library() {
        return id_british_library;
    }

    public void setId_british_library(List<String> id_british_library) {
        this.id_british_library = id_british_library;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLending_identifier_s() {
        return lending_identifier_s;
    }

    public void setLending_identifier_s(String lending_identifier_s) {
        this.lending_identifier_s = lending_identifier_s;
    }

    public String getIa_collection_s() {
        return ia_collection_s;
    }

    public void setIa_collection_s(String ia_collection_s) {
        this.ia_collection_s = ia_collection_s;
    }

    public Integer getFirst_publish_year() {
        return first_publish_year;
    }

    public void setFirst_publish_year(Integer first_publish_year) {
        this.first_publish_year = first_publish_year;
    }

    public List<String> getId_amazon_de_asin() {
        return id_amazon_de_asin;
    }

    public void setId_amazon_de_asin(List<String> id_amazon_de_asin) {
        this.id_amazon_de_asin = id_amazon_de_asin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getPublish_place() {
        return publish_place;
    }

    public void setPublish_place(List<String> publish_place) {
        this.publish_place = publish_place;
    }

    public List<String> getIa_box_id() {
        return ia_box_id;
    }

    public void setIa_box_id(List<String> ia_box_id) {
        this.ia_box_id = ia_box_id;
    }

    public Integer getEdition_count() {
        return edition_count;
    }

    public void setEdition_count(Integer edition_count) {
        this.edition_count = edition_count;
    }

    public List<String> getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(List<String> author_name) {
        this.author_name = author_name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<String> getId_alibris_id() {
        return id_alibris_id;
    }

    public void setId_alibris_id(List<String> id_alibris_id) {
        this.id_alibris_id = id_alibris_id;
    }

    public List<String> getId_goodreads() {
        return id_goodreads;
    }

    public void setId_goodreads(List<String> id_goodreads) {
        this.id_goodreads = id_goodreads;
    }

    public List<String> getAuthor_alternative_name() {
        return author_alternative_name;
    }

    public void setAuthor_alternative_name(List<String> author_alternative_name) {
        this.author_alternative_name = author_alternative_name;
    }

    public Boolean getPublic_scan_b() {
        return public_scan_b;
    }

    public void setPublic_scan_b(Boolean public_scan_b) {
        this.public_scan_b = public_scan_b;
    }

    public List<String> getPublisher() {
        return publisher;
    }

    public void setPublisher(List<String> publisher) {
        this.publisher = publisher;
    }

    public List<String> getId_amazon() {
        return id_amazon;
    }

    public void setId_amazon(List<String> id_amazon) {
        this.id_amazon = id_amazon;
    }

    public List<String> getId_canadian_national_library_archive() {
        return id_canadian_national_library_archive;
    }

    public void setId_canadian_national_library_archive(List<String> id_canadian_national_library_archive) {
        this.id_canadian_national_library_archive = id_canadian_national_library_archive;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public List<String> getLccn() {
        return lccn;
    }

    public void setLccn(List<String> lccn) {
        this.lccn = lccn;
    }

    public Integer getLast_modified_i() {
        return last_modified_i;
    }

    public void setLast_modified_i(Integer last_modified_i) {
        this.last_modified_i = last_modified_i;
    }

    public String getLending_edition_s() {
        return lending_edition_s;
    }

    public void setLending_edition_s(String lending_edition_s) {
        this.lending_edition_s = lending_edition_s;
    }

    public List<String> getId_librarything() {
        return id_librarything;
    }

    public void setId_librarything(List<String> id_librarything) {
        this.id_librarything = id_librarything;
    }

    public String getCover_edition_key() {
        return cover_edition_key;
    }

    public void setCover_edition_key(String cover_edition_key) {
        this.cover_edition_key = cover_edition_key;
    }

    public List<String> getPerson() {
        return person;
    }

    public void setPerson(List<String> person) {
        this.person = person;
    }

    public List<String> getPublish_year() {
        return publish_year;
    }

    public void setPublish_year(List<String> publish_year) {
        this.publish_year = publish_year;
    }

    public String getPrintdisabled_s() {
        return printdisabled_s;
    }

    public void setPrintdisabled_s(String printdisabled_s) {
        this.printdisabled_s = printdisabled_s;
    }

    public List<String> getPlace() {
        return place;
    }

    public void setPlace(List<String> place) {
        this.place = place;
    }

    public List<String> getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(List<String> publish_date) {
        this.publish_date = publish_date;
    }
}
