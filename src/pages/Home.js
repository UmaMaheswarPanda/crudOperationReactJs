import React, { useEffect, useState } from "react";
import axios from "axios";
export default function Home() {
  const [user, setUser] = useState([]);
  useEffect(() => {
    loadUsers();
  }, []);
  const loadUsers = async () => {
    const result = await axios.get("http://localhost:8090/user");
    setUser(result.data);
  };

  return (
    <div className="container">
      <div className="py-4">
        <table className="table table table-hover border shadow">
          <thead>
            <tr>
              <th scope="col">S.no</th>
              <th scope="col">UserId</th>
              <th scope="col">UserName</th>
              <th scope="col">Name</th>
              <th scope="col">Email</th>
              <th scope="col">Mobile</th>
              <th scope="col">Action</th>
            </tr>
          </thead>
          <tbody>
            {user.map((user, index) => (
              <tr key={user.userId}>
                <th scope="row">{index + 1}</th>
                <td>{user.userId}</td>
                <td>{user.userName}</td>
                <td>{user.name}</td>
                <td>{user.email}</td>
                <td>{user.mobile}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}
