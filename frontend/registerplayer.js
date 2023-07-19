const registerPlayerForm = document.querySelector("#registerplayer-form");

registerPlayerForm.onsubmit = async function(evt) {
    evt.preventDefault();
    const id = document.querySelector("#id").value;
    const name = document.querySelector("#name").value;
    const position = document.querySelector("#position").value;
    const teamName = document.querySelector("#teamName").value;
    const teamCity = document.querySelector("#teamCity").value;

    const newPlayer = {
        "id": id,
        "name": name,
        "position": position,
        "teamName": teamName,
        "teamCity": teamCity
    }

    axios.post("https://zqk3radl43.execute-api.us-west-2.amazonaws.com/prod/players", newPlayer)
    .then((res) => {
        console.log(res);
        window.location.reload();
    })
}