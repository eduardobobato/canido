package dev.bobato.canido.resolver;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.bobato.canido.input.UserInput;
import dev.bobato.canido.model.User;
import dev.bobato.canido.repository.UserRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class UserResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private UserRepository userRepository;

	public Collection<User> findAllUsers() {
		return userRepository.findAll();
	}

	public User saveUser(UserInput user) {
		return this.userRepository.save(new User(user.getName(), user.getPassword()));
	}
}