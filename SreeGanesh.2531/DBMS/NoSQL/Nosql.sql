1.
List the databases
a.
show dbs
2.
Create/Switch to a database
a.
use myexperiment;
3.
Create a Collection
a.
db.createCollection("firstCollection");
4.
Add a single document
db.firstCollection.insertOne({
city: "Chennai",
state: "TamilNadu",
// ... more fields
});
5.
Add multiple documents
db.firstCollection.insertMany([
{
city: "Madhurai",
state: "TamilNadu",
},
{
city: "Bangalore",
state: "Karnataka",
},
//
6.
List the documents
// Find all cities
db.firstCollection.find({});
// Find state named "TamilNadu"
db.firstCollection.find({ state: "TamilNadu" });
// Find state named "TamilNadu" and only return the city name
db.firstCollection.find({ state: "TamilNadu" }, { city: 1, state: 1, _id:0});
7.
Update the documents
//update name of 1 city from Madhurai to Madurai
db.firstCollection.updateOne(
{ city: "Madhurai" },
{ $set: { city: "Madurai" } }
);
//update name of all state in all documents from TamilNadu to Tamilnadu
db.firstCollection.updateMany(
{ state: "TamilNadu" },
{ $set: { state: "Tamilnadu" } }
);
//update name of all states from Tamilnadu to TN and add a new field capital
db.firstCollection.updateMany(
{ state: "Tamilnadu" },
{ $set: { state: "TN", capital: "Chennai" } }
);
8.
Delete a document
db.firstCollection.deleteOne({ state: "Karnataka" });