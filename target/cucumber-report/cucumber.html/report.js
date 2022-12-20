$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("checkout.feature");
formatter.feature({
  "line": 1,
  "name": "Product Checkout",
  "description": "As user I want to checkout online from tutorialsninja  website",
  "id": "product-checkout",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5439245200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User can add product in shopping cart from Desktop menu",
  "description": "",
  "id": "product-checkout;user-can-add-product-in-shopping-cart-from-desktop-menu",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    },
    {
      "line": 4,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover “Desktops” Tab and click",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on “Show All Desktops” submenu",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I sort by position \"Name: A to Z",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select product “HP LP3065”",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Delivery Date \"2022-11-30\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select Qty 1",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Add cart button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on link “shopping cart” display into success message",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I change the currency to \"£\" from \"$\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I redirected to shopping cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 107685401,
  "status": "passed"
});
formatter.match({
  "location": "PageFunctionalitySteps.iMouseHoverDesktopsTabAndClick()"
});
formatter.result({
  "duration": 713612300,
  "status": "passed"
});
formatter.match({
  "location": "PageFunctionalitySteps.iClickOnShowAllDesktopsSubmenu()"
});
formatter.result({
  "duration": 869446400,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iSortByPositionNameAToZ()"
});
formatter.result({
  "duration": 447703200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3065",
      "offset": 23
    }
  ],
  "location": "CheckoutShoppingCartSteps.iSelectProductHPLP(int)"
});
formatter.result({
  "duration": 1355556600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022-11-30",
      "offset": 24
    }
  ],
  "location": "CheckoutShoppingCartSteps.iSelectDeliveryDate(String)"
});
formatter.result({
  "duration": 109091700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    }
  ],
  "location": "CheckoutShoppingCartSteps.iSelectQty(int)"
});
formatter.result({
  "duration": 128098901,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iClickOnAddCartButton()"
});
formatter.result({
  "duration": 559203101,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iClickOnLinkShoppingCartDisplayIntoSuccessMessage()"
});
formatter.result({
  "duration": 671391099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£",
      "offset": 26
    },
    {
      "val": "$",
      "offset": 35
    }
  ],
  "location": "CheckoutShoppingCartSteps.iChangeTheCurrencyToFrom(String,String)"
});
formatter.result({
  "duration": 20032437200,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d108.0.5359.125)\nBuild info: version: \u00274.6.0\u0027, revision: \u002779f1c02ae20\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [dc3e0ef18015b11186169c22c0517989, clickElement {id\u003d7edd2707-5937-4de9-86e8-31e46cb5e212}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\H\\AppData\\Local\\Te...}, goog:chromeOptions: {debuggerAddress: localhost:50341}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50341/devtoo..., se:cdpVersion: 108.0.5359.125, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (dc3e0ef18015b11186169c22c0517989)] -\u003e xpath: //span[contains(text(),\u0027Currency\u0027)]]\nSession ID: dc3e0ef18015b11186169c22c0517989\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:541)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:257)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:78)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat com.tutorialsninja.demo.utility.Utility.clickOnElement(Utility.java:50)\r\n\tat com.tutorialsninja.demo.pages.HomePage.chooseYourCurrency(HomePage.java:112)\r\n\tat com.tutorialsninja.demo.steps.CheckoutShoppingCartSteps.iChangeTheCurrencyToFrom(CheckoutShoppingCartSteps.java:73)\r\n\tat ✽.And I change the currency to \"£\" from \"$\"(checkout.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iRedirectedToShoppingCartPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 774565801,
  "status": "passed"
});
formatter.before({
  "duration": 4754301600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User can add product in shopping cart from Laptops \u0026 Notebooks menu",
  "description": "",
  "id": "product-checkout;user-can-add-product-in-shopping-cart-from-laptops-\u0026-notebooks-menu",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@regression"
    },
    {
      "line": 18,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I mouse hover on “Laptops \u0026 Notebooks”",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I click on “Show All Laptops \u0026 Notebooks\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I change the currency to \"£\" from \"$\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I sort by \"Price (High \u003e Low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I select product “MacBook”",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on \u0027Add To cart\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on “shopping cart” display into success message",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I Change Quantity From \"1\" to \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I Click on update",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I Click on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I Click on “Guest Checkout” radio button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I Click on “continue” tab",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I filled the required information",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I Click on “continue” button in reg form",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I Add Comments About your order into text area",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I Check the Terms \u0026 Conditions check box",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I Click on “Continue” button after comment",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I will get some error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 5585301,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iMouseHoverOnLaptopsNotebooks()"
});
formatter.result({
  "duration": 71858800,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iClickOnShowAllLaptopsNotebooks()"
});
formatter.result({
  "duration": 683544200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£",
      "offset": 26
    },
    {
      "val": "$",
      "offset": 35
    }
  ],
  "location": "CheckoutShoppingCartSteps.iChangeTheCurrencyToFrom(String,String)"
});
formatter.result({
  "duration": 612413300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High \u003e Low)",
      "offset": 11
    }
  ],
  "location": "CheckoutShoppingCartSteps.iSortBy(String)"
});
formatter.result({
  "duration": 364853000,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iSelectProductMacBook()"
});
formatter.result({
  "duration": 1384348400,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 46165100,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iClickOnShoppingCartDisplayIntoSuccessMessage()"
});
formatter.result({
  "duration": 686290799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 24
    },
    {
      "val": "2",
      "offset": 31
    }
  ],
  "location": "CheckoutShoppingCartSteps.iChangeQuantityFromTo(String,String)"
});
formatter.result({
  "duration": 107467600,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iClickOnUpdate()"
});
formatter.result({
  "duration": 502410299,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iClickOnCheckoutButton()"
});
formatter.result({
  "duration": 329235401,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iClickOnGuestCheckoutRadioButton()"
});
formatter.result({
  "duration": 2065640001,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iClickOnContinueTab()"
});
formatter.result({
  "duration": 1058402400,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iFilledTheRequiredInformation()"
});
formatter.result({
  "duration": 1656396599,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iClickOnContinueButtonInRegForm()"
});
formatter.result({
  "duration": 20038502699,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d108.0.5359.125)\nBuild info: version: \u00274.6.0\u0027, revision: \u002779f1c02ae20\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [676357e112980e65f364b3d6c9ec6f44, clickElement {id\u003de264a9ca-45b0-4af2-98dd-e3e08db1dc98}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\H\\AppData\\Local\\Te...}, goog:chromeOptions: {debuggerAddress: localhost:50376}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50376/devtoo..., se:cdpVersion: 108.0.5359.125, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (676357e112980e65f364b3d6c9ec6f44)] -\u003e css selector: #button-guest]\nSession ID: 676357e112980e65f364b3d6c9ec6f44\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:541)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:257)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:78)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat com.tutorialsninja.demo.utility.Utility.clickOnElement(Utility.java:50)\r\n\tat com.tutorialsninja.demo.pages.CheckoutPage.clickOnContinueGuestBttn(CheckoutPage.java:179)\r\n\tat com.tutorialsninja.demo.steps.CheckoutShoppingCartSteps.iClickOnContinueButtonInRegForm(CheckoutShoppingCartSteps.java:156)\r\n\tat ✽.And I Click on “continue” button in reg form(checkout.feature:34)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iAddCommentsAboutYourOrderIntoTextArea()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iCheckTheTermsConditionsCheckBox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iClickOnContinueButtonAfterComment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CheckoutShoppingCartSteps.iWillGetSomeErrorMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1008796899,
  "status": "passed"
});
});