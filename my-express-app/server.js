const express = require('express');
const app = express();
const port = 3000;

// Middleware, um JSON zu verarbeiten
app.use(express.json());

// Startdaten: 10 Personen
let persons = [
  { id: 1, firstname: 'Bob', lastname: 'marlie' },
  { id: 2, firstname: 'Talha', lastname: 'bubu' },
  { id: 3, firstname: 'Ahmet', lastname: 'buuu' },
  { id: 4, firstname: 'Yüp', lastname: 'uiui' },
  { id: 5, firstname: 'Vinzi', lastname: 'lala' },
  { id: 6, firstname: 'Nate', lastname: 'uiui' },
  { id: 7, firstname: 'Julian', lastname: 'buiu' },
  { id: 8, firstname: 'Leonard', lastname: 'baba' },
  { id: 9, firstname: 'Sam', lastname: 'gut' },
  { id: 10, firstname: 'dsffds', lastname: 'bubo' },
];


app.get('/persons', (req, res) => res.json(persons));

app.post('/persons', (req, res) => {
  const person = req.body;
  person.id = persons.length + 1;
  persons.push(person);
  res.json(person);
});

app.put('/persons/:id', (req, res) => {
  const id = +req.params.id;
  const person = persons.find(p => p.id === id);
  if (person) {
    Object.assign(person, req.body);
    res.json(person);
  } else {
    res.status(404).send('Nost found');
  }
});

app.delete('/persons/:id', (req, res) => {
  const id = +req.params.id;
  persons = persons.filter(p => p.id !== id);
  res.send('Deleted');
});


app.listen(port, () => console.log(`Server läuft auf http://localhost:${port}`));