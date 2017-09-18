const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {characters: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/movieCharacters'}).done(response => {
			this.setState({characters: response.entity._embedded.movieCharacters});
		});
	}

	render() {
		return (
			<CharacterList characters={this.state.characters}/>
		)
	}
}