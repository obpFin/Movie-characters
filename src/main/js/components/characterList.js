export class CharacterList extends React.Component{
	render() {
		var characters = this.props.characters.map(character =>
			<characters key={character._links.self.href} character={character}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Description</th>
						<th>Url</th>
					</tr>
					{characters}
				</tbody>
			</table>
		)
	}
}

