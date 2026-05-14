import { createContext, useContext } from "react"

export const themes = {
    actual : {
         background: "orange",
         text: "purple",
         fontSize:36,
         fontFamily:"Garamond"
    }
}

export const FontContext = createContext(themes.actual)