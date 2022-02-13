//simple function

function createPerson(name) {
    const obj = {};
    obj.name = name;
    obj.introduceSelf = function() {
      console.log(`Hi! I'm ${this.name}.`);
    }
    return obj;
  }

  console.log(createPerson('Prachi'))


//constructor
function Subject(name,faculty,duration,stream12)
{
    this.subjectName = name;
    this.facultyName = faculty;
    this.duration = duration;
    this.stream = stream12;
    
    this.showDetails= function(){
      console.log(`${this.subjectName} is taught by ${this.facultyName} for ${this.duration} days`)
    }
}
var sub1 = new Subject('maths','rizvi',30,'science')
var sub2 = new Subject('history','kapoor',50,'arts')
console.log(sub1,sub2)
//console.log(Subject('english','phadke',40))








  