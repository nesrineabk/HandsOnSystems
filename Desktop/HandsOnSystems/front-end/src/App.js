import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import {useEffect, useState} from 'react';


function App() {
  let [message, setMessage] = useState("");
  let [message2, setMessage2] = useState("");
 

  useEffect(() => {
      axios.get('http://localhost:8099/Universe/hello').then((res)=>{


     setMessage(res.data);


     });
 
     axios.get('http://localhost:8099/World/hello').then((res)=>{

      setMessage2(res.data);
 
 
      });
  


  //   console.log(result_message);
  });



  return (
   <p>
  Universe Message
  <br></br>
  <br></br>
  <br></br>
   {message}

   <br></br>
   <br></br>
   <br></br>
   World Message
   <br></br>
   <br></br>
   <br></br>
   {message2}
   </p>
  );
}

export default App;
