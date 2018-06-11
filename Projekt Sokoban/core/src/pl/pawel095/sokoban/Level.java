package pl.pawel095.sokoban;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

import pl.pawel095.sokoban.controller.KeyboardConroller;

public class Level {
	public World level;
	
	private KeyboardConroller cont;
	private Body player;
	
	public Level(KeyboardConroller cont) {
		level = new World(new Vector2(0, -10f), false);
		this.cont=cont;
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.KinematicBody;
		bodyDef.position.set(0, -12);

		player = level.createBody(bodyDef);
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(1, 1);

		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1f;
		
		player.createFixture(shape, 0.0f);
		
		createObject();
		createFloor();
		createMovingObject();
	}

	public void logicStep(float delta) {
		level.step(delta, 3, 3);
		if(cont.up) {
			player.setLinearVelocity(0, 3);
		}else if(cont.down) {
			player.setLinearVelocity(0, -3);
		}else if (cont.left) {
			player.setLinearVelocity(-3, 0);
		}else if (cont.right) {
			player.setLinearVelocity(3, 0);
		}else {
			player.setLinearVelocity(0, 0);
		}
	}

	private void createObject() {

		// create a new body definition (type and location)
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.DynamicBody;
		bodyDef.position.set(0, 0);

		// add it to the world
		Body bodyd = level.createBody(bodyDef);

		// set the shape (here we use a box 50 meters wide, 1 meter tall )
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(1, 1);

		// set the properties of the object ( shape, weight, restitution(bouncyness)
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1f;

		// create the physical object in our body)
		// without this our body would just be data in the world
		bodyd.createFixture(shape, 0.0f);

		// we no longer use the shape object here so dispose of it.
		shape.dispose();
	}

	private void createFloor() {
		// create a new body definition (type and location)
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.StaticBody;
		bodyDef.position.set(0, -10);
		// add it to the world
		Body bodys = level.createBody(bodyDef);
		// set the shape (here we use a box 50 meters wide, 1 meter tall )
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(50, 1);
		// create the physical object in our body)
		// without this our body would just be data in the world
		bodys.createFixture(shape, 0.0f);
		// we no longer use the shape object here so dispose of it.
		shape.dispose();
	}

	private void createMovingObject() {

		// create a new body definition (type and location)
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.KinematicBody;
		bodyDef.position.set(0, -12);

		// add it to the world
		Body bodyk = level.createBody(bodyDef);

		// set the shape (here we use a box 50 meters wide, 1 meter tall )
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(1, 1);

		// set the properties of the object ( shape, weight, restitution(bouncyness)
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		fixtureDef.density = 1f;

		// create the physical object in our body)
		// without this our body would just be data in the world
		bodyk.createFixture(shape, 0.0f);

		// we no longer use the shape object here so dispose of it.
		shape.dispose();

		bodyk.setLinearVelocity(0, 0.75f);
	}

}
