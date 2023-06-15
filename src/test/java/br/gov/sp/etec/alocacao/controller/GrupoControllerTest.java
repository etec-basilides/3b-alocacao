/*
 * package br.gov.sp.etec.alocacao.controller;
 * 
 * import static org.junit.jupiter.api.Assertions.assertEquals; import static
 * org.junit.jupiter.api.Assertions.assertNotNull; import static
 * org.junit.jupiter.api.Assertions.assertNull; import static
 * org.mockito.ArgumentMatchers.any; import static org.mockito.Mockito.when;
 * 
 * import java.util.List;
 * 
 * import org.junit.jupiter.api.Test; import org.mockito.InjectMocks; import
 * org.mockito.Mock;
 * 
 * import br.gov.sp.etec.alocacao.entity.Carro; import
 * br.gov.sp.etec.alocacao.entity.Grupo; import
 * br.gov.sp.etec.alocacao.repository.GrupoRepository;
 * 
 * public class GrupoControllerTest {
 * 
 * @InjectMocks GrupoController controller;
 * 
 * @Mock GrupoRepository reposity;
 * 
 * @Mock List<Grupo> listaGrupo;
 * 
 * @Mock Grupo grupo;
 * 
 * @Test public void carrosTesteComListaDeCarros() {
 * when(reposity.findAll()).thenReturn(listaGrupo); List<Grupo> grupo =
 * controller.grupo(); assertNotNull(grupo); }
 * 
 * 
 * @Test public void carrosTesteNull() {
 * when(reposity.findAll()).thenReturn(null); List<Grupo> grupo =
 * controller.grupo(); assertNull(grupo); }
 * 
 * 
 * @Test public void AdicionarCarroComTesteSucesso() {
 * when(reposity.save(any(Grupo.class))).thenReturn(getGrupo()); Carro c =
 * controller.updateGrupo(new Carro("branco","12345", 1234L, "HB20"));
 * assertEquals("fusca", c.getModelo()); assertEquals("branco", c.getCor());
 * assertEquals(1234L, c.getChassi()); assertEquals(1234L, c.getPlaca());
 * assertEquals(1L, c.getId());
 * 
 * }
 * 
 * @Test public void atualizarCarroComTesteSucesso() {
 * when(reposity.save(any(Grupo.class))).thenReturn(getGrupo()); Carro c =
 * controller.updateGrupo(getGrupo()); assertEquals("fusca", c.getModelo());
 * 
 * }
 * 
 * @Test public void deletarCarroComTesteSucesso() {
 * //when(reposity.save(anyLong(Carro.class))).thenReturn(getCarro());
 * controller.deleteGrupo(1L); //assertNull(null); }
 * 
 * private Carro getGrupo() { Grupo grupo = new Grupo(); grupo.setId(1L);
 * grupo.setModelo("fusca"); grupo.setCor("Branco"); grupo.setPlaca("1234");
 * grupo.setChassi(1234L); return grupo; }
 * 
 * 
 * 
 * }
 */