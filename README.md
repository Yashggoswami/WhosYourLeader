# WhosYourLeader

A platform where you can find about details about people contesting election in your constituency

database creation -->
https://github.com/Yashggoswami/Web-scraping/blob/feat/database/Database/DataBaseCreation.sql

database client - https://tableplus.com/windows

Routes :
1. Get all elections : **/elections**
2. Get all electiontypes using election-id : **/electiontype/{election_id}**
3. Get all states by election-id and electiontype-id : **/states/{election_id}/{electiontype_id}**
4. Get all constituencies by electiontype-id and state_id : **/constituency/{electiontype_id}/{state_id}**
5. Get all candidates by constituency_id(for the current election) : **/candidates/{constituency_id}**
6. Get all candidates : **/candidates**

**Front-end repo** : https://github.com/suryanjain14/WhosYourLeader_APP.git

**Web-scraping automation script repo** : https://github.com/vinaygoswami321/Web-scraping.git

**Database Schema** :

![Database Schema](https://user-images.githubusercontent.com/68124405/180519386-f8ae9ebb-1138-46b4-8f9d-5e1b94873b36.png)


**Front-End Bootstrap** :

![image](https://user-images.githubusercontent.com/68124405/180520783-ec0557fb-982d-4d7d-ba51-5a6d6f5f6399.png)

**Swagger** :

![swagger](https://user-images.githubusercontent.com/41690889/180760299-198820e4-1b13-482a-a40c-80fec666b1c4.png)

**Actuator** :

![actuator](https://user-images.githubusercontent.com/41690889/180760599-a0886dc1-8b1d-4ff7-89cd-e0d1131ba13f.png)


