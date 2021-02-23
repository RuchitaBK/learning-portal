//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import static com.abk.hs.crm.exception.code.UmsErrorCode.INVALID_USER_CREDENTIALS;
//
//@Service
//@Log4j2
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserDao userDao;
//
//    @Autowired
//    private UserDataMapper userDataMapper;
//
//    @Override
//    public LoginResponse validateUser(LoginRequest req) {
//        UserDetails userDetails = userDao.getUserDetails(req);
//
//        if (userDetails == null) {
//            throw new InvalidDataException(INVALID_USER_CREDENTIALS);
//        }
//
//
//        return new LoginResponse(userDetails);
//
//    }
//
//    @Override
//    public UserResponse addUser(UserRequest request) {
//        try {
//            UserDetails userDetails = userDataMapper.getUserDetails(request);
//            userDao.createUser(userDetails);
//            return new UserResponse(userDetails);
//        } catch (Exception exc) {
//            throw new InvalidDataException("Not able to insert user profile");
//        }
//    }
//}