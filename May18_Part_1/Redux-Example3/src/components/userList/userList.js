import React, { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { fetchUsers } from '../../features/UserOperations';

const UserList = () => {

  const dispatch = useDispatch();

  const { userList, error } = useSelector(
    (state) => state.users
  );

  useEffect(() => {
    dispatch(fetchUsers());
  }, [dispatch]);

  return (
    <div>

      <p>User Details Are</p>
        <table border="3" align="center">
          <tr>
            <th>Id</th>
            <th>Name</th>
            <th>UserName</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Website</th>
          </tr>
      
      {userList.map((user) => (
        <tr>
          <td>{user.id}</td>
           <td>{user.name}</td>
           <td>{user.username}</td>
           <td>{user.email}</td>
           <td>{user.phone}</td>
           <td>{user.website}</td>
           
        </tr>
        
      ))}
</table>
    </div>
  );
}

export default UserList;