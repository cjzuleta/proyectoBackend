document.addEventListener("DOMContentLoaded", () => {
  fetch("/api/energy/types")
    .then(r => r.json())
    .then(list => {
      const ul = document.getElementById("types");
      list.forEach(t => {
        const li = document.createElement("li");
        li.textContent = t.name;
        ul.appendChild(li);
      });
    });

  fetch("/api/energy/data")
    .then(r => r.json())
    .then(list => {
      const ul = document.getElementById("data");
      list.forEach(d => {
        const li = document.createElement("li");
        li.textContent = `${d.year} — ${d.energyType ? d.energyType.name : 'N/A'} — Prod=${d.production} Cons=${d.consumption}`;
        ul.appendChild(li);
      });
    });

  document.getElementById("btnTotal").addEventListener("click", () => {
    fetch("/api/energy/total-production")
      .then(r => r.json())
      .then(n => document.getElementById("totalResult").textContent = n);
  });

  document.getElementById("btnTotalAsync").addEventListener("click", () => {
    document.getElementById("totalResult").textContent = "Calculando (async)...";
    fetch("/api/energy/total-production-async")
      .then(r => r.json())
      .then(n => document.getElementById("totalResult").textContent = n);
  });

});


