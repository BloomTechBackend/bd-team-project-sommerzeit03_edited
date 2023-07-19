const updatePlayerForm = document.querySelector("#updateplayer-form");

updatePlayerForm.onsubmit = async function(evt) {
    evt.preventDefault();
    const id = document.querySelector("#id").value;
    const atBats = document.querySelector("#atBats").value;
    const homeruns = document.querySelector("#homeruns").value;
    const runsBattedIn = document.querySelector("#runsBattedIn").value;
    const hits = document.querySelector("#hits").value;
    const runsScored = document.querySelector("#runsScored").value;
    const stolenBases = document.querySelector("#stolenBases").value;

    const updatedPlayer = {
        "id": id,
        "atBats": atBats,
        "homeruns": homeruns,
        "runsBattedIn": runsBattedIn,
        "hits": hits,
        "runsScored": runsScored,
        "stolenBases": stolenBases
    }

    axios.put("https://zqk3radl43.execute-api.us-west-2.amazonaws.com/prod/players", updatedPlayer)
    .then((res) => {
        console.log(res);
        window.location.reload();
    })
}

window.onload = async function(evt) {
    evt.preventDefault()
}