$(document).ready(function(){
    var election_id;
    var electionType_id;
    var state_id;
    var constituency_id;

   $.ajax({
       url:git /elections",
       success:function(data){
       data.forEach(element => $("#election").append(`<option id= ${element.electionId} >${element.electionName}</option>`));
       }
   });

   $('#election').change(function(){
              	var opt = $(this).children(':selected').attr('id');
              	 election_id = opt;
              	 electionType_id = undefined;
              	 state_id = undefined;
              	 constituency = undefined;

              	 $("#election-type").children('option:not(:first)').remove();
              	 $("#state").children('option:not(:first)').remove();
              	 $("#constituency").children('option:not(:first)').remove();
                 getElectionTypes();
      });

    $('#election-type').change(function(){
                 	var opt = $(this).children(':selected').attr('id');
                 	electionType_id = opt;
                 	$("#state").children('option:not(:first)').remove();
                    $("#constituency").children('option:not(:first)').remove();
                    state_id = undefined;
                    constituency_id = undefined;
                    getStates();
    });

     $('#state').change(function(){
                     	var opt = $(this).children(':selected').attr('id');
                     	state_id = opt;
                     	$("#constituency").children('option:not(:first)').remove();
                     	constituency_id = undefined;
                        getConstituency();
     });

     $('#constituency').change(function(){
                        var opt = $(this).children(':selected').attr('id');
                        constituency_id = opt;
     });

  function getElectionTypes(){
      $.ajax({
       url:"/electiontype/"+election_id,
       success:function(data){
        data.forEach(element => $("#election-type").append(`<option id= ${element.electiontypeId} >${element.electiontypeName}</option>`));
       }
      });
   }

   function getStates(){
         $.ajax({
          url:"/states/"+election_id+"/"+electionType_id,
          success:function(data){
           data.forEach(element => $("#state").append(`<option id= ${element.stateId} >${element.stateName}</option>`));
          }
         });
      }

     function getConstituency(){
              $.ajax({
               url:"/constituency/"+electionType_id+"/"+state_id,
               success:function(data){
                data.forEach(element => $("#constituency").append(`<option id= ${element.constituencyId} >${element.constituencyName}</option>`));
               }
              });
          }

      $("#filter").click( function(){
          if(election_id == undefined || electionType_id == undefined || state_id == undefined || constituency_id == undefined){
             alert("please select all the fields");
          }
          else{
            $.ajax({
               url:"/candidates/"+constituency_id,
               success:function(data){
                  $('#candidate-table-body').empty();
                  data.forEach(candidate => $("#candidate-table-body").append(`
                     <tr id=${candidate.candidateId}>
                                     <td>${candidate.candidateName}</td>
                                     <td><img src = ${candidate.candidateImage}  width="100" height="100"></td>
                                     <td>${candidate.candidateStatus}</td>
                                     <td>${candidate.partyName}</td>
                                     <td>${candidate.constituencyName}</td>
                                 </tr>
                  `));
               }
            });
          }
      });

});
