package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
    private RetailHomePage homePage;
    private RetailLoginPage loginPage;

    public POMFactory() {
        this.homePage = new RetailHomePage();
        this.loginPage = new RetailLoginPage();
    }

    public RetailHomePage homePage() {
        return this.homePage;
    }

    public RetailLoginPage loginPage() {
        return this.loginPage;
    }
}
