/*

Stephen McIntyre
g00325469@gmit.ie
06/03/2020

Creating arguments that may cause a test case to be passed or failed.
Generating our variables.

 */

package ie.gmit;

 class Employee {

    private String title;
    private String name;
    private String PPS;
    private String number;

     String getTitle() {
        return title;
    }

     String getName() {
        return name;
    }

     String getPPS() {
        return PPS;
    }

     String getNumber() {
        return number;
    }

     String getEmploymentType() {
        return employmentType;
    }

     int getAge() {
        return age;
    }

    private String employmentType;
    private int age;

     Employee(String title, String name, String PPS, String number, String employmentType, int age) {

        if (title.equals("Mr") || title.equals("Mrs")  || title.equals("Miss")) {
            this.title = title;
        }
        else
            throw  new IllegalArgumentException("Title must be MR,Mrs ir Miss");

        if(name.length() >= 5 & name.length()<=22){
            this.name = name;
        }
        else
            throw  new IllegalArgumentException("Please enter Valid name or name Size");

        if(PPS.length() == 6){
            this.PPS = PPS;
        }
        else
            throw  new IllegalArgumentException("Please enter Valid PPS number");

        if(number.length() == 7){
            this.number = number;
        }
        else
            throw new IllegalArgumentException("Please enter Valid phone number");

        if(employmentType.equals("Full-time") || employmentType.equals("Part-time")){
            this.employmentType = employmentType;
        }

        else
            throw new IllegalArgumentException("Please enter Valid employment title");

        if(age <= 18){
            throw new IllegalArgumentException("Under age, Too young to work here. must be 18 or over");
        }
        else
            this.age = age;
    }

}
