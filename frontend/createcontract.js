const createContractForm = document.querySelector("#createcontract-form");

createContractForm.onsubmit = async function(evt) {
    evt.preventDefault();
    const id = document.querySelector("#id").value;
    const playerId = document.querySelector("#playerId").value;
    const yearlySalary = document.querySelector("#yearlySalary").value;
    const totalYears = document.querySelector("#totalYears").value;

    const newContract = {
        "id": id,
        "playerId": playerId,
        "yearlySalary": yearlySalary,
        "totalYears": totalYears
    }

    axios.post("https://zqk3radl43.execute-api.us-west-2.amazonaws.com/prod/contracts", newContract)
    .then((res) => {
        console.log(res);
        window.location.reload();
    })
}
