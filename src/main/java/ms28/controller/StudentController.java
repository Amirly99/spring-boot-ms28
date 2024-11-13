package ms28.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

//HTTPS - > METHODS->REST API;
//Read -> GET;
//Create -> POST;
//Delete -> DELETE;
//Update -> PUT;
/*
HTTP response status codes:

Informational responses (100 – 199)
Successful responses (200 – 299)
Redirection messages (300 – 399)
Client error responses (400 – 499)
Server error responses (500 – 599)
 */
@RestController
@RequestMapping(value = "/student")//Yeni sorgularin gonderilmesi unvan kimi;
@RequiredArgsConstructor
public class StudentController {


}
