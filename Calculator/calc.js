function clearText() {
  let textArea = document.getElementById("display");
  // console.log(textArea?.value.substring(0,textArea.value.length-1))
  if (textArea.value) {
    textArea.value = textArea.value.substring(0, textArea.value.length - 1);
  }
}
function clearWholeText() {
  let textArea = document.getElementById("display");
  // console.log(textArea?.value.substring(0,textArea.value.length-1))
  if (textArea.value) {
    textArea.value = ""
  }
}
function calculate() {
  let textArea = document.getElementById("display")
  if (textArea.value) {
    textArea.value = eval(textArea.value)
  }
}
function formExpression(x){
  let textArea = document.getElementById("display")
  textArea.value+=x
}