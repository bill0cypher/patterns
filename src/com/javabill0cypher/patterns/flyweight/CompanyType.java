package com.javabill0cypher.patterns.flyweight;

public class CompanyType {
    private String name;
    private String city;
    private SellCategory sellCategory;
    private CompanyRate companyRate;

    public CompanyType(String name, String city, SellCategory sellCategory, CompanyRate companyRate) {
        this.name = name;
        this.city = city;
        this.sellCategory = sellCategory;
        this.companyRate = companyRate;
    }
}
