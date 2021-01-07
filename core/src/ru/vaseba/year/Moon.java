package ru.vaseba.year;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import static  ru.vaseba.year.YearGame.*;

public class Moon {
    private Texture texture;
    private Vector2 position;
    private float time;

    public Moon() {
        this.texture = new Texture("moon.png");
        this.position = new Vector2(WIDTH - 300, HEIGHT - 240);

    }

    public void render(SpriteBatch batch, Texture threadTexture) {
        batch.draw(threadTexture, position.x + 100, position.y + 190);
        float keof = 0.2f * MathUtils.sin(time);
        batch.setColor(0.8f + keof, 0.8f + keof, 0.8f, 1.0f);
        batch.draw(texture, position.x, position.y, 100, 0, 200, 200, 1 + keof, 1, 0, 0, 0, texture.getWidth(), texture.getHeight(), false, false);
        batch.setColor(1,1,1,1);
    }

    public void update(float dt) {
        time += dt;
    }
}
