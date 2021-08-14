/*
we basically only have impure code because our application mostly relies on data from the user 
and each command shares that data globally so we have alot of side effects 
*/

let Command = function (execute, value) {
  this.execute = execute
  this.value = User 
}

let CreateCommand = function (value) {
  username = prompt("Choose a username")
  firstName = prompt("What's your first name?")
  lastName = prompt("What's your last name?")
  age = prompt("How old are you?")
  phone = prompt("What's your phone number?")
  value = new User(username, firstName, lastName, age, email, phone, interests)
  return new Command(value)

}

let EditCommand = function (value) {
  username = prompt("Choose another username")
  firstName = prompt("Write another first name")
  lastName = prompt("Write another last name")
  age = prompt("Write another age")
  phone = prompt("Write another phone number")
  value = new User(username, firstName, lastName, age, email, phone, interests)
  
  return new Command(value)
}

/*
let DeleteCommand = function (value) {
  return new Command(value)
}
*/

let ShowCommand = function (value) {
  username = document.getElementById("username")
  firstName = document.getElementById("firstName")
  lastName = document.getElementById("lastName")
  age = document.getElementById("age")
  email = document.getElementById("email")
  phone = document.getElementById("phone")
  interests = document.getElementById("interests")

  username.innerHTML = value.username
  firstName.innerHTML = value.firstName
  lastName.innerHTML = value.lastName
  age.innerHTML = value.age
  email.innerHTML = value.email
  phone.innerHTML = value.phone
  interests.innerHTML = value.interests.forEach(element => {
    `<li><button class="delete"> X </button> ${element} </li>`
  })
  return new Command(value)
}
command = new Command()
document.getElementById("create").addEventListener("click",CreateCommand())
document.getElementById("edit").addEventListener("click", EditCommand)
//document.getElementsByClassName("delete").addEventListener("click", DeleteCommand)
