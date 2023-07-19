const searchPlayerForm = document.querySelector("#searchplayer-form ");
const infoDiv = document.querySelector(".info");
//const urlParams = new URLSearchParams(window.location.search);
//const id = urlParams.get('id');

searchPlayerForm.onsubmit = async function(evt) {
    evt.preventDefault();
    const id = document.querySelector("#id").value;
    axios.get("https://zqk3radl43.execute-api.us-west-2.amazonaws.com/prod/players/"+id)
    .then((res) => {
        console.log(res);
        //window.location.reload();
        populateInfo(res.data);
    })

}

function populateInfo(data) {
    let player = data.player
    const nameH2 = document.createElement("h2");
    const teamCityP  = document.createElement("p");
    const teamNameP  = document.createElement("p");
    const positionP  = document.createElement("p");
    const atBatsP  = document.createElement("p");
    const hitsP  = document.createElement("p");
    const avgP  = document.createElement("p");
    const homerunsP  = document.createElement("p");
    const rbiP  = document.createElement("p");
    const runsP  = document.createElement("p");
    const stolenBasesP  = document.createElement("p");

    const nameText = document.createTextNode(player.name);
    const teamCityText = document.createTextNode(player.teamCity);
    const teamNameText = document.createTextNode(player.teamName);
    const positionText = document.createTextNode(player.position);
    const atBatsText = document.createTextNode(player.atBats);
    const hitsText = document.createTextNode(player.hits);
    const avgText = document.createTextNode(player.battingAverage);
    const homerunsText = document.createTextNode(player.homeruns);
    const rbiText = document.createTextNode(player.runsBattedIn);
    const runsText = document.createTextNode(player.runsScored);
    const stolenBasesText = document.createTextNode(player.stolenBases);

    nameH2.appendChild(nameText);
    teamCityP.appendChild(teamCityText);
    teamNameP.appendChild(teamNameText);
    positionP.appendChild(positionText);
    atBatsP.appendChild(atBatsText);
    hitsP.appendChild(hitsText);
    avgP.appendChild(avgText);
    homerunsP.appendChild(homerunsText);
    rbiP.appendChild(rbiText);
    runsP.appendChild(runsText);
    stolenBasesP.appendChild(stolenBasesText);

    infoDiv.appendChild(nameH2);
    infoDiv.append(teamCityP);
    infoDiv.append(positionP);
    infoDiv.append(teamNameP);
    infoDiv.append(atBatsP);
    infoDiv.append(hitsP);
    infoDiv.append(avgP);
    infoDiv.append(homerunsP);
    infoDiv.append(rbiP);
    infoDiv.append(runsP);
    infoDiv.append(stolenBasesP);
    

}