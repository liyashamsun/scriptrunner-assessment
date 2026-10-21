# Cam Automat Editor VS Code extension

This repo contains all that is needed to build a VS Code extension for a graphical cam automat editor.

The graphical cam automat editor provides a reactive graphical view of a cam automat configuration file.

The extension can open an *.axisfeature configuration file and present it in a graphical editor inside VS Code.

## Rough idea
<img src="Markdown/strawberry-svgrepo-com.svg" alt="Rough idea - labeler" width="1400" >

This repo contains:

- docs:
- utils:
  - emsdk (sdk for webassembly build)
  - Firmware sources and wrappers for a wasm to calculate compensation gear polynomials
- tests:
- samples:

Related files:
- [copilot instructions](README.md)

Workflows:
When changing the repo use one of the following workflows as a basis.
- [feature prompt](markdown/macro.md)

## Integration tests

`npm run test` runs the integration layer via `@vscode/test-electron`. Instead of
downloading a separate VS Code build (~300MB), it reuses your locally installed
VS Code, auto-detected from the usual Windows install locations. If your install
is elsewhere (or you want to target Insiders/a portable build), set
`VSCODE_TEST_EXE` to the `Code.exe` path before running the tests. If no local
install is found, the runner fails fast and does not download VS Code.
