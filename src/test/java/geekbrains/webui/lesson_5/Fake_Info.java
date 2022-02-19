package geekbrains.webui.lesson_5;

import com.github.javafaker.Faker;

public class Fake_Info {
    void FakeAddress() {
        Faker faker = new Faker();
        String streetName = faker.address().streetName();
        String number = faker.address().buildingNumber();
        String city = faker.address().city();
        String country = faker.address().country();
        System.out.println(String.format("%s\n%s\n%s\n%s", number, streetName, city, country));
    }

//    @Test
//    public void givenJavaFakersWithDifferentLocals_thenHeckZipCodesMatchRegex()
//    {
//        Faker ukFaker = new Faker(new Locale("en-GB"));
//        Faker usFaker = new Faker(new Locale("en-US"));
//        System.out.println(String.format("American zipcode: %s", usFaker.address().zipCode()));
//        System.out.println(String.format("British postcode: %s", ukFaker.address().zipCode()));

//        Pattern ukPattern = Pattern.compile("([Gg][Ii][Rr] 0[Aa]{2})|((([A-Za-z][0-9]{1,2})|" +
//        "(([A-Za-z][A-Ha-hJ-Yj-y][0-9]{1,2})|(([A-Za-z][0-9][A-Za-z])|([A-Za-z][A-Ha-hJ-Yj-y]" +
//        "[0-9]?[A-Za-z]))))\\s?[0-9][A-Za-z]{2})");

//        Matcher ukMatcher = ukPattern.matcher(ukFaker.address().zipCode());
//        assertTrue(ukMatcher.find());

//        Matcher usMatcher = Pattern.compile("^\\d{5}(?:[-\\s]\\d{4})?$").matcher(usFaker.address().zipCode());
//        assertTrue(usMatcher.find());
//    }

//    @Test
//    public void whenBothifyCalled_checkPatternMatches() throws Exception {
//
//        FakeValuesService fakeValuesService = new FakeValuesService(
//                new Locale("en-GB"), new RandomService());
//
//        String email = fakeValuesService.bothify("????##@gmail.com");
//        Matcher emailMatcher = Pattern.compile("\\w{4}\\d{2}@gmail.com").matcher(email);
//
//        assertTrue(emailMatcher.find());
//    }

}



