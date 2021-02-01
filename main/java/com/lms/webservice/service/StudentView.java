package com.lms.webservice.service;

import com.lms.webservice.dao.StudentViewDao;
import com.lms.webservice.model.UserModel;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.List;

@Path("/studentView")
public class StudentView {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> studentView(UserModel um) throws SQLException, ClassNotFoundException {
        return StudentViewDao.viewAttendance(um);

    }

}
