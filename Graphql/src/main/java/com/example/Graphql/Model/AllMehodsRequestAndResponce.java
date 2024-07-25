package com.example.Graphql.Model;

public class AllMehodsRequestAndResponce {
    //for saving data
//    type Mutation {
//        createAuthor(id: ID!, firstName: String!, lastName: String!, status: String!): Author
//        createBook(id: ID!, name: String!, pageCount: String!, authorId: ID!): Book
//    }

    //creating Author
    //post->http://localhost:8089/graphql
//    body->{
//        "query": "mutation { createAuthor(id: 4, firstName: \"prakasha\", lastName: \"bhol\", status: \"complited\") { id firstName lastName status } }"
//    }
    //{
    //    "data": {
    //        "createAuthor": {
    //            "id": "4",
    //            "firstName": "prakasha",
    //            "lastName": "bhol",
    //            "status": "complited"
    //        }
    //    }
    //}


    //creating Book
    //post->http://localhost:8089/graphql
    //{
    //  "query": "mutation { createBook(id: 1, name: \"Sample Book\", pageCount: \"100\", authorId: 1) { id name pageCount authorId } }"
    //}
    //responce
    //{
    //    "data": {
    //        "createBook": {
    //            "id": "1",
    //            "name": "Sample Book",
    //            "pageCount": "100",
    //            "authorId": "1"
    //        }
    //    }
    //}



    //getting records basedon requiedment
//  post->http://localhost:8089/graphql
//     allAuthors: [Author]
//    {
//  "query": "query { allAuthors {  status, firstName } }"
//}
//    {
//    "data": {
//        "allAuthors": [
//            {
//                "status": "Active",
//                "firstName": "John"
//            },
//            {
//                "status": "Active",
//                "firstName": "John"
//            },
//            {
//                "status": "complited",
//                "firstName": "akash"
//            },
//            {
//                "status": "complited",
//                "firstName": "prakasha"
//            }
//        ]
//    }
//}
}
