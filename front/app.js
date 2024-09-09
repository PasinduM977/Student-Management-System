
function getStudents() {

    
    fetch("http://localhost:8080/getStudent")
    .then(res => res.json())
    .then(data => {
        let tbody = "";

        data.forEach(element => {

            let tdata =
                `<tr>
        <td>${element.name}</td>
        <td>${element.address}</td>
        <td>${element.guardName}</td>
        <td>${element.phone}</td>
    </tr>`

   
        document.getElementById("tbody").innerHTML += tdata;
    
   

        });


    })
  

}

const txtStuName = document.getElementById("txtStuName");
const txtAge = document.getElementById("txtAge");
const cmbGender = document.getElementById("cmbGender");
const txtAddress = document.getElementById("txtAddress");
const txtGName = document.getElementById("txtGName");
const txtPhone = document.getElementById("txtPhone");

let Student = {
    name: txtStuName.value,
    age: txtAge.value,
    gender: cmbGender.value,
    address: txtAddress.value,
    gname: txtGName.value,
    phone: txtPhone.value

}

function saveStudent() {

    fetch("http://localhost:8080/saveStudent", {
        method: 'POST',
        body: JSON.stringify(Student),
        headers: new Headers({ "Content-Type": "application/json" })

    })
        .then(res => res.json())
        .then(res => {


            alert(res.Status);

        })


        clear();


}

function clear() {
    txtStuName.value = "";
    txtAge.value = "";
    txtAddress.value = "";
    txtGName.value = "";
    txtPhone.value = "";
}



