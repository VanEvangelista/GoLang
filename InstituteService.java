package com.example.ivan.webapiservice;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by Ivan on 4/5/2016.
 */
public interface InstituteService {

    @GET("/thesis/roomrequest_user2")
    public void getStudent(Callback<List<Student>> callback);

    //i.e. http://localhost/api/institute/Students/1
    //Get student record base on ID
    @GET("/thesis/roomrequest_user2/{id}")
    public void getStudentById(@Path("id") Integer id,Callback<Student> callback);

    //i.e. http://localhost/api/institute/Students/1
    //Delete student record base on ID
    @DELETE("/thesis/roomrequest_user2/{id}")
    public void deleteStudentById(@Path("id") Integer id,Callback<Student> callback);

    //i.e. http://localhost/api/institute/Students/1
    //PUT student record and post content in HTTP request BODY
    @PUT("/thesis/roomrequest_user2/{id}")
    public void updateStudentById(@Path("id") Integer id,@Body Student student,Callback<Student> callback);

    //i.e. http://localhost/api/institute/Students
    //Add student record and post content in HTTP request BODY
    @POST("/thesis/roomrequest_user2")
    public void addStudent(@Body Student student,Callback<Student> callback);
}
