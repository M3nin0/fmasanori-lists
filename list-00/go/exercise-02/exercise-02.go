package main

import "fmt"

func main() {

    var days, hours, minutes, seconds int

    fmt.Print("Insert days: ")
    fmt.Scan(&days)

    fmt.Print("Insert hours: ")
    fmt.Scan(&hours)

    fmt.Print("Insert minutes: ")
    fmt.Scan(&minutes)

    fmt.Print("Insert seconds: ")
    fmt.Scan(&seconds)

    fmt.Println("Total of seconds is", days * 24 * 60 * 60 +  hours * 60 * 60 + minutes * 60 + seconds)

}
