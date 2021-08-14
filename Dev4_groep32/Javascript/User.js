class User {
  username = "";
  firstName = "";
  lastName = "";
  age = null;
  email = "";
  phone = null;
  subjects = ["C++", "C#", "java", "SQL", "javascript", "HTML", "CSS"];
  interests = [""];

  User(username, firstName, lastName, age, email, phone, interests) {
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.email = email;
    this.phone = phone;
    this.interests = interests;
  }

}