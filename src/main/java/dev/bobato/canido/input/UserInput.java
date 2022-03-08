package dev.bobato.canido.input;

import graphql.schema.GraphQLInputType;
import graphql.schema.GraphQLSchemaElement;
import graphql.schema.GraphQLTypeVisitor;
import graphql.util.TraversalControl;
import graphql.util.TraverserContext;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserInput implements GraphQLInputType {
	
	private String name;
	private String password;
	private String confirmPassword;

	@Override
	public TraversalControl accept(TraverserContext<GraphQLSchemaElement> context, GraphQLTypeVisitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public GraphQLSchemaElement copy() {
		// TODO Auto-generated method stub
		return null;
	}
}
