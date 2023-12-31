import React, { useContext, useEffect, useState } from 'react'
import Search from '../Components/Search/Search'
import { GlobalContext } from "../Context/globalContext";
import Recomendados from '../Components/Recomendados/Recomendados'
import './Home.css'


const Home = () => {
  
  const { listaLibros, isLoading } = useContext(GlobalContext);
  
  return (
    <div className='home'>
      <Search />
    </div>

  )
}

export default Home