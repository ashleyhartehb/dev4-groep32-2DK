/*
we basically only have impure code because our application mostly relies on data from the user 
and each command shares that data globally so we have alot of side effects 
*/

/* Code gebaseerd op https://www.dofactory.com/javascript/design-patterns/command */
let totalText = document.getElementById("total");
let total = 0.0;


let Calculate = function () {

  return {
    add: function (price) {
      console.log(typeof total);
      total += price;
      totalText.innerText = `${total}`
      console.log(total);
      return total;
    },
    subtract: function (price) {
      total -= price
      totalText.innerText = `${total}`
      console.log(total);
      return total;
    }
  }
}

let calculate = new Calculate();


let Command = function (execute, undo, price) {
  this.execute = execute
  this.undo = undo;
  this.price = price;

}

let AddCommand = function (price) {
  let add = calculate.add(price);
  let subtract = calculate.subtract(price);
  return new Command(add, subtract, price);
}

let SubCommand = function (price) {
  let add = calculate.add(price);
  let subtract = calculate.subtract(price);
  return new Command(subtract, add, price);
}


let CommandsController = function () {
  let currentValue = 0;
  let commands = [];

  function action(command) {
    var name = command.execute.toString().substr(9, 3);
    return name.charAt(0).toUpperCase() + name.slice(1);
  }

  return {
    execute: function (command) {
      console.log(command);
      currentValue = command.execute(currentValue, command.value);
      commands.push(command);
      console.log(action(command) + ": " + command.value);
    },

    undo: function () {
      console.log(command);
      var command = commands.pop();
      currentValue = command.undo(currentValue, command.value);
      console.log("Undo " + action(command) + ": " + command.value);
    }
  }
}


let commandsController = new CommandsController();

//listening to click event of ADDING NUMBER
let elements = document.getElementsByClassName("add");

for (i = 0; i < elements.length; i++) {
  let innertext = elements[i].innerText;
  elements[i].addEventListener("click", () => {
    let parsedText = parseFloat(innertext)
    console.log(parsedText);
    commandsController.execute(new AddCommand(parsedText));
  });
}

//listening to click event of UNDOING ACTION

let undoElement = document.getElementById("undo");
if (undoElement) {
  undoElement.addEventListener("click", () => {
    commandsController.undo();
  });
} else {
  console.log(undoElement);
}