package com.javabill0cypher.patterns.flyweight;
import com.javabill0cypher.patterns.flyweight.CompanyType;

public class Company {
    private boolean promotionActive;
    private Integer annualPremium;
    private CompanyType type;

    public Company(boolean promotionActive, Integer annualPremium, CompanyType type) {
        this.promotionActive = promotionActive;
        this.annualPremium = annualPremium;
        this.type = type;
    }
}
