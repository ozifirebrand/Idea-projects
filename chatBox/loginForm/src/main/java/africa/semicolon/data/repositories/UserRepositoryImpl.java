package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository{
    Map<Integer, User> database = new HashMap<>();
    private static Integer key = 0;
    echo "# Idea-projects" >> README.md
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/ozifirebrand/Idea-projects.git
    git push -u origin main

    @Override
    public User createUser(User user) {
        key ++;
        database.put(key, user);
        return user;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public User findUserById() {
        return null;
    }
}
