package padroescriacao.singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SessaoUsuarioTest {

    @Test
    public void deveRetornarUsuarioLogado() {
        SessaoUsuario.getInstance().setUsuarioLogado("João");
        assertEquals("João", SessaoUsuario.getInstance().getUsuarioLogado());
    }

    @Test
    public void deveAlterarUsuarioLogado() {
        SessaoUsuario.getInstance().setUsuarioLogado("Maria");
        assertEquals("Maria", SessaoUsuario.getInstance().getUsuarioLogado());
    }
}