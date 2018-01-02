package com.gdi.testscenarios;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class TestScenarioMapper {
	
	public static void executeFunction(String functionName, AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException{
		if(functionName.equalsIgnoreCase("UC01_BannerLogoTermsConditions"))
		{
			UC01_BannerLogoTermsConditions BannerLogoTermsConditions=new UC01_BannerLogoTermsConditions(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC02_SkipThistep"))
		{
			UC02_SkipThistep SkipThis=new UC02_SkipThistep(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC03_CreateNewAccount"))
		{
			UC03_CreateNewAccount CreateNewAccount = new UC03_CreateNewAccount(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC04_CompleteProfileBadgeValidation"))
		{
			UC04_CompleteProfileBadgeValidation CompleteProfileBadgeValidation = new UC04_CompleteProfileBadgeValidation(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC05_ValidateNotifications"))
		{
			UC05_ValidateNotifications ValidateNotifications = new UC05_ValidateNotifications(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC06_LogoutLoginBackValidateProfile"))
		{
			UC06_LogoutLoginBackValidateProfile LogoutLoginBackValidateProfile = new UC06_LogoutLoginBackValidateProfile(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC07_LoginWithExistingAccountWrongPwd"))
		{
			UC07_LoginWithExistingAccountWrongPwd LoginWithExistingAccountWrongPwd = new UC07_LoginWithExistingAccountWrongPwd(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC08_CreateAccountWithInvalidPassword"))
		{
			UC08_CreateAccountWithInvalidPassword CreateAccountWithInvalidPassword = new UC08_CreateAccountWithInvalidPassword(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC09_Login"))
		{
			UC09_Login Login = new UC09_Login(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC10_EmptyBagMessage"))
		{
			UC10_EmptyBagMessage EmptyBagMessage = new UC10_EmptyBagMessage(androidDriver, testReport);
		}	
		if(functionName.equalsIgnoreCase("UC11_WeHandPickedTheseForYou"))
		{
			UC11_WeHandPickedTheseForYou WeHandPickedTheseForYou = new UC11_WeHandPickedTheseForYou(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC12_VerifyElementsOnHomePage"))
		{
			UC12_VerifyElementsOnHomePage VerifyElementsOnHomePage = new UC12_VerifyElementsOnHomePage(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC13_EmptyWishlistMessage"))
		{
			UC13_EmptyWishlistMessage EmptyWishlistMessage = new UC13_EmptyWishlistMessage(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC14_CarousalLinks"))
		{
			UC14_CarousalLinks CarousalLinks = new UC14_CarousalLinks(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC15_Categories"))
		{
			UC15_Categories Categories = new UC15_Categories(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC16_GiftCard"))
		{
			UC16_GiftCard GiftCard = new UC16_GiftCard(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC17_FaqTermsPrivacyLinks"))
		{
			UC17_FaqTermsPrivacyLinks FaqTermsPrivacyLinks = new UC17_FaqTermsPrivacyLinks(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC18_NavigateToSubCategiries"))
		{
			UC18_NavigateToSubCategiries NavigateToSubCategiries = new UC18_NavigateToSubCategiries(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC19_Filters"))
		{
			UC19_Filters Filters = new UC19_Filters(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC20_ImageZoom"))
		{
			UC20_ImageZoom ImageZoom = new UC20_ImageZoom(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC21_TextPrice"))
		{
			UC21_TextPrice TextPrice = new UC21_TextPrice(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC22_SendShare"))
		{
			UC22_SendShare SendShare = new UC22_SendShare(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC23_SizeSelection"))
		{
			UC23_SizeSelection SizeSelection = new UC23_SizeSelection(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC24_ValidateSizeChart"))
		{
			UC24_ValidateSizeChart ValidateSizeChart = new UC24_ValidateSizeChart(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC25_AddToBag"))
		{
			UC25_AddToBag AddToBag = new UC25_AddToBag(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC26_SaveToWishList"))
		{
			UC26_SaveToWishList SaveToWishList = new UC26_SaveToWishList(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC27_FindInStore"))
		{
			UC27_FindInStore FindInStore = new UC27_FindInStore(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC28_Description"))
		{
			UC28_Description Description = new UC28_Description(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC29_BagQuantity"))
		{
			UC29_BagQuantity BagQuantity = new UC29_BagQuantity(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC30_EditQuantity"))
		{
			UC30_EditQuantity EditQuantity = new UC30_EditQuantity(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC32_ValidateSummaryIsUpdating"))
		{
			UC32_ValidateSummaryIsUpdating ValidateSummaryIsUpdating = new UC32_ValidateSummaryIsUpdating(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC33_ApplyProfileCoupon"))
		{
			UC33_ApplyProfileCoupon ApplyProfileCoupon = new UC33_ApplyProfileCoupon(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC34_CheckOutButton"))
		{
			UC34_CheckOutButton CheckOutButton = new UC34_CheckOutButton(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC35_SaveSelectShipping"))
		{
			UC35_SaveSelectShipping SaveSelectShipping = new UC35_SaveSelectShipping(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC36_ShippingMethod"))
		{
			UC36_ShippingMethod ShippingMethod = new UC36_ShippingMethod(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC37_AddCreditCard"))
		{
			UC37_AddCreditCard AddGiftCardToBag = new UC37_AddCreditCard(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC38_CheckOutWithNewCC"))
		{
			UC38_CheckOutWithNewCC CheckOutWithNewCC = new UC38_CheckOutWithNewCC(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC39_CheckOutWithoutSavingcreditCard"))
		{
			UC39_CheckOutWithoutSavingcreditCard checkOutWithoutSavingcreditCard = new UC39_CheckOutWithoutSavingcreditCard(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC40_CheckOutWithGC"))
		{
			UC40_CheckOutWithGC checkOutWithGC = new UC40_CheckOutWithGC(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC41_CountrySelection"))
		{
			UC41_CountrySelection CountrySelection = new UC41_CountrySelection(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC42_ProvinceSelection"))
		{
			UC42_ProvinceSelection ProvinceSelection = new UC42_ProvinceSelection(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC43_CitySelection"))
		{
			UC43_CitySelection CitySelection = new UC43_CitySelection(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC44_StoreSelection"))
		{
			UC44_StoreSelection StoreSelection = new UC44_StoreSelection(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC45_ValidateBottomButtons"))
		{
			UC45_ValidateBottomButtons ValidateBottomButtons = new UC45_ValidateBottomButtons(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC46_MyProfile"))
		{
			UC46_MyProfile MyProfile = new UC46_MyProfile(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC47_OrderHistory"))
		{
			UC47_OrderHistory OrderHistory = new UC47_OrderHistory(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC48_CustomerId"))
		{
			UC48_CustomerId CustomerId = new UC48_CustomerId(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC49_ProfileSetting"))
		{
			UC49_ProfileSetting ProfileSetting = new UC49_ProfileSetting(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC50_ValidateTagScanButton"))
		{
			UC50_ValidateTagScanButton ValidateTagScanButton = new UC50_ValidateTagScanButton(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC51_GetFirstName"))
		{
			UC51_GetFirstName GetFirstName = new UC51_GetFirstName(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC52_GetLastName"))
		{
			UC52_GetLastName GetLastName = new UC52_GetLastName(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC53_GetPhoneNumber"))
		{
			UC53_GetPhoneNumber GetPhoneNumber = new UC53_GetPhoneNumber(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC54_ChangePasswordLink"))
		{
			UC54_ChangePasswordLink ChangePasswordLink = new UC54_ChangePasswordLink(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC55_BirthdayEdit"))
		{
			UC55_BirthdayEdit BirthdayEdit = new UC55_BirthdayEdit(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC56_EditAddressButton"))
		{
			UC56_EditAddressButton EditAddressButton = new UC56_EditAddressButton(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC57_RemoveAddressButton"))
		{
			UC57_RemoveAddressButton RemoveAddressButton = new UC57_RemoveAddressButton(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC58_AddNewAddress"))
		{
			UC58_AddNewAddress AddNewAddress = new UC58_AddNewAddress(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC59_LanguagePreferences"))
		{
			UC59_LanguagePreferences LanguagePreferences = new UC59_LanguagePreferences(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC60_UpdateProfileButton"))
		{
			UC60_UpdateProfileButton UpdateProfileButton = new UC60_UpdateProfileButton(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC61_SearchByProdID"))
		{
			UC61_SearchByProdID SearchByProdID = new UC61_SearchByProdID(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC62_SerachByKeyword"))
		{
			UC62_SerachByKeyword serachByKeyword = new UC62_SerachByKeyword(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC63_OfferSorryMessage"))
		{
			UC63_OfferSorryMessage OfferSorryMessage = new UC63_OfferSorryMessage(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC64_OfferStartShoppingButton"))
		{
			UC64_OfferStartShoppingButton OfferStartShoppingButton = new UC64_OfferStartShoppingButton(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC65_MyStudioTitle"))
		{
			UC65_MyStudioTitle MyStudioTitle = new UC65_MyStudioTitle(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC66_StudioInfoHeader"))
		{
			UC66_StudioInfoHeader StudioInfoHeader = new UC66_StudioInfoHeader(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC67_LocalizationHeader"))
		{
			UC67_LocalizationHeader LocalizationHeader = new UC67_LocalizationHeader(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC68_SlideBetweenBadges"))
		{
			UC68_SlideBetweenBadges UC68_SlideBetweenBadges = new UC68_SlideBetweenBadges(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC69_SeeRewardsLink"))
		{
			UC69_SeeRewardsLink SeeRewardsLink = new UC69_SeeRewardsLink(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC70_RewardsAndBenifitsTitle"))
		{
			UC70_RewardsAndBenifitsTitle RewardsAndBenifitsTitle = new UC70_RewardsAndBenifitsTitle(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC71_BaseBenifits"))
		{
			UC71_BaseBenifits BaseBenifits = new UC71_BaseBenifits(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC72_VIPBenifits"))
		{
			UC72_VIPBenifits VIPBenifits = new UC72_VIPBenifits(androidDriver, testReport);
		}
		
		if(functionName.equalsIgnoreCase("UC73_KeepProductInWishlist"))
		{
			UC73_KeepProductInWishlist KeepProductInWishlist = new UC73_KeepProductInWishlist(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC74_AddProductToBagFromWishlist"))
		{
			UC74_AddProductToBagFromWishlist AddProductToBagFromWishlist = new UC74_AddProductToBagFromWishlist(androidDriver, testReport);
		}
		if(functionName.equalsIgnoreCase("UC75_RemoveProductFromCart"))
		{
			UC75_RemoveProductFromCart RemoveProductFromCart = new UC75_RemoveProductFromCart(androidDriver, testReport);
		}
		
	}
	
}
