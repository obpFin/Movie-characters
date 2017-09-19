export class Character extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.character.firstName}</td>
				<td>{this.props.character.lastName}</td>
				<td>{this.props.character.description}</td>
				<td>{this.props.character.url}</td>
			</tr>
		)
	}
}